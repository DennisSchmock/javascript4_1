/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dennis
 */
public class Quote {

    private String quote;
    private final List<String> quotes = new ArrayList();

    public Quote(String quote) {
        this.quote = quote;
        
        

    }

    public Quote getRandomQuote(){
        Random rand = new Random();
        return new Quote(quotes.get(rand.nextInt(quotes.size()-1)));
    }
    /**
     * @return the quote
     */
    public String getQuote() {
        return quote;
    }

    public Quote() {
    quotes.add("Life isn’t about getting and having, it’s about giving and being. - Kevin Kruse");
        quotes.add("Whatever the mind of man can conceive and believe, it can achieve. - Napoleon Hill");
        quotes.add("Strive not to be a success, but rather to be of value. - Albert Einstein");
        quotes.add("Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference. - Robert Frost");
        quotes.add("I attribute my success to this: I never gave or took any excuse. - Florence Nightingale");
        quotes.add("You miss 100% of the shots you don’t take. - Wayne Gretzky");
        quotes.add("I’ve missed more than 9000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed. - Michael Jordan");
        quotes.add("The most difficult thing is the decision to act, the rest is merely tenacity. - Amelia Earhart");
        quotes.add("Every strike brings me closer to the next home run. - Babe Ruth");
        quotes.add("Definiteness of purpose is the starting point of all achievement. - W. Clement Stone");
        quotes.add("We must balance conspicuous consumption with conscious capitalism. - Kevin Kruse");
        quotes.add("Life is what happens to you while you’re busy making other plans. - John Lennon");
        quotes.add("We become what we think about. - Earl Nightingale");
        quotes.add("14.Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover. - Mark Twain");
        quotes.add("15.Life is 10% what happens to me and 90% of how I react to it. - Charles Swindoll");
        quotes.add("The most common way people give up their power is by thinking they don’t have any. - Alice Walker");
        quotes.add("The mind is everything. What you think you become. - Buddha");
        quotes.add("The best time to plant a tree was 20 years ago. The second best time is now. - Chinese Proverb");
        quotes.add("An unexamined life is not worth living. - Socrates");
        quotes.add("Eighty percent of success is showing up. - Woody Allen");
        quotes.add("Your time is limited, so don’t waste it living someone else’s life. - Steve Jobs");
        quotes.add("Winning isn’t everything, but wanting to win is. - Vince Lombardi");
        quotes.add("I am not a product of my circumstances. I am a product of my decisions. - Stephen Covey");
        quotes.add("Every child is an artist.  The problem is how to remain an artist once he grows up. - Pablo Picasso");
        quotes.add("You can never cross the ocean until you have the courage to lose sight of the shore. - Christopher Columbus");
        quotes.add("I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. - Maya Angelou");
        quotes.add("Either you run the day, or the day runs you. - Jim Rohn");
        quotes.add("Whether you think you can or you think you can’t, you’re right. - Henry Ford");
        quotes.add("The two most important days in your life are the day you are born and the day you find out why. - Mark Twain");
        quotes.add("Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it. - Johann Wolfgang von Goethe");
        quotes.add("The best revenge is massive success. - Frank Sinatra");
        quotes.add("People often say that motivation doesn’t last. Well, neither does bathing.  That’s why we recommend it daily. - Zig Ziglar");
        quotes.add("Life shrinks or expands in proportion to one’s courage. - Anais Nin");
        quotes.add("If you hear a voice within you say “you cannot paint,” then by all means paint and that voice will be silenced. - Vincent Van Gogh");
        quotes.add("There is only one way to avoid criticism: do nothing, say nothing, and be nothing. - Aristotle");
        quotes.add("Ask and it will be given to you; search, and you will find; knock and the door will be opened for you. - Jesus");
        quotes.add("The only person you are destined to become is the person you decide to be. - Ralph Waldo Emerson");
        quotes.add("Go confidently in the direction of your dreams.  Live the life you have imagined. - Henry David Thoreau");
        quotes.add("When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me. - Erma Bombeck");
        quotes.add("Few things can help an individual more than to place responsibility on him, and to let him know that you trust him. - Booker T. Washington");
        quotes.add("Certain things catch your eye, but pursue only those that capture the heart. -  Ancient Indian Proverb");
        quotes.add("Believe you can and you’re halfway there. - Theodore Roosevelt");
        quotes.add("Everything you’ve ever wanted is on the other side of fear. - George Addair");
        quotes.add("We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light. - Plato");
        quotes.add("Teach thy tongue to say, “I do not know,” and thous shalt progress. - Maimonides");
        quotes.add("Start where you are. Use what you have.  Do what you can. - Arthur Ashe");
        quotes.add("When I was 5 years old, my mother always told me that happiness was the key to life.  When I went to school, they asked me what I wanted to be when I grew up.  I wrote down ‘happy’.  They told me I didn’t understand the assignment, and I told them they didn’t understand life. - John Lennon");
        quotes.add("Fall seven times and stand up eight. - Japanese Proverb");
        quotes.add("When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us. - Helen Keller");
        quotes.add("Everything has beauty, but not everyone can see. - Confucius");
        quotes.add("How wonderful it is that nobody need wait a single moment before starting to improve the world. - Anne Frank");
        quotes.add("When I let go of what I am, I become what I might be. - Lao Tzu");
        quotes.add("Life is not measured by the number of breaths we take, but by the moments that take our breath away. - Maya Angelou");
        quotes.add("Happiness is not something readymade.  It comes from your own actions. - Dalai Lama");
        quotes.add("If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on. - Sheryl Sandberg");
        quotes.add("First, have a definite, clear practical ideal; a goal, an objective. Second, have the necessary means to achieve your ends; wisdom, money, materials, and methods. Third, adjust all your means to that end. - Aristotle");
        quotes.add("If the wind will not serve, take to the oars. - Latin Proverb");
        quotes.add("You can’t fall if you don’t climb.  But there’s no joy in living your whole life on the ground. - Unknown");
        quotes.add("We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained. - Marie Curie");
        quotes.add("Too many of us are not living our dreams because we are living our fears. - Les Brown");
        quotes.add("Challenges are what make life interesting and overcoming them is what makes life meaningful. - Joshua J. Marine");
        quotes.add("If you want to lift yourself up, lift up someone else. - Booker T. Washington");
        quotes.add("I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do. - Leonardo da Vinci");
        quotes.add("Limitations live only in our minds.  But if we use our imaginations, our possibilities become limitless. - Jamie Paolinetti");
        quotes.add("You take your life in your own hands, and what happens? A terrible thing, no one to blame. - Erica Jong");
        quotes.add("What’s money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do. - Bob Dylan");
        quotes.add("I didn’t fail the test. I just found 100 ways to do it wrong. - Benjamin Franklin");
        quotes.add("In order to succeed, your desire for success should be greater than your fear of failure. - Bill Cosby");
        quotes.add("A person who never made a mistake never tried anything new. -  Albert Einstein");
        quotes.add("The person who says it cannot be done should not interrupt the person who is doing it. - Chinese Proverb");
        quotes.add("There are no traffic jams along the extra mile. - Roger Staubach");
        quotes.add("It is never too late to be what you might have been. - George Eliot");
        quotes.add("You become what you believe. - Oprah Winfrey");
        quotes.add("I would rather die of passion than of boredom. - Vincent van Gogh");
        quotes.add("A truly rich man is one whose children run into his arms when his hands are empty. - Unknown");
        quotes.add("It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings. - Ann Landers");
        quotes.add("If you want your children to turn out well, spend twice as much time with them, and half as much money. - Abigail Van Buren");
        quotes.add("Build your own dreams, or someone else will hire you to build theirs. - Farrah Gray");
        quotes.add("The battles that count aren’t the ones for gold medals. The struggles within yourself–the invisible battles inside all of us–that’s where it’s at. - Jesse Owens");
        quotes.add("Education costs money.  But then so does ignorance. - Sir Claus Moser");
        quotes.add("I have learned over the years that when one’s mind is made up, this diminishes fear. - Rosa Parks");
        quotes.add("It does not matter how slowly you go as long as you do not stop. - Confucius");
        quotes.add("If you look at what you have in life, you’ll always have more. If you look at what you don’t have in life, you’ll never have enough. - Oprah Winfrey");
        quotes.add("Remember that not getting what you want is sometimes a wonderful stroke of luck. - Dalai Lama");
        quotes.add("You can’t use up creativity.  The more you use, the more you have. - Maya Angelou");
        quotes.add("Dream big and dare to fail. - Norman Vaughan");
        quotes.add("Our lives begin to end the day we become silent about things that matter. - Martin Luther King Jr.");
        quotes.add("Do what you can, where you are, with what you have. - Teddy Roosevelt");
        quotes.add("If you do what you’ve always done, you’ll get what you’ve always gotten. - Tony Robbins");
        quotes.add("Dreaming, after all, is a form of planning. - Gloria Steinem");
        quotes.add("It’s your place in the world; it’s your life. Go on and do all you can with it, and make it the life you want to live. - Mae Jemison");
        quotes.add("You may be disappointed if you fail, but you are doomed if you don’t try. - Beverly Sills");
        quotes.add("Remember no one can make you feel inferior without your consent. - Eleanor Roosevelt");
        quotes.add("Life is what we make it, always has been, always will be. - Grandma Moses");
        quotes.add("The question isn’t who is going to let me; it’s who is going to stop me. - Ayn Rand");
        quotes.add("When everything seems to be going against you, remember that the airplane takes off against the wind, not with it. - Henry Ford");
        quotes.add("It’s not the years in your life that count. It’s the life in your years. - Abraham Lincoln");
        quotes.add("Change your thoughts and you change your world. - Norman Vincent Peale");
        quotes.add("Either write something worth reading or do something worth writing. - Benjamin Franklin");
        quotes.add("Nothing is impossible, the word itself says, “I’m possible!” - –Audrey Hepburn");
        quotes.add("The only way to do great work is to love what you do. - Steve Jobs");
        quotes.add("If you can dream it, you can achieve it. - Zig Ziglar");
    }

    /**
     * @param quote the quote to set
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

}
